#include <iostream>
using namespace std;

// Function to merge two sorted subarrays
void merge(int arr[], int left, int middle, int right) {
    int left_size = middle - left + 1;
    int right_size = right - middle;

    // Create temporary arrays (using dynamic allocation)
    int* left_array = new int[left_size];
    int* right_array = new int[right_size];

    // Copy data to temporary arrays
    for (int i = 0; i < left_size; i++)
        left_array[i] = arr[left + i];
    for (int j = 0; j < right_size; j++)
        right_array[j] = arr[middle + 1 + j];

    // Merge the temporary arrays back into the original array
    int i = 0;
    int j = 0;
    int k = left;
    while (i < left_size && j < right_size) {
        if (left_array[i] <= right_array[j]) {
            arr[k] = left_array[i];
            i++;
        } else {
            arr[k] = right_array[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements of left_array, if any
    while (i < left_size) {
        arr[k] = left_array[i];
        i++;
        k++;
    }

    // Copy the remaining elements of right_array, if any
    while (j < right_size) {
        arr[k] = right_array[j];
        j++;
        k++;
    }

    // Free the dynamically allocated memory
    delete[] left_array;
    delete[] right_array;
}

// Function to implement merge sort
void mergeSort(int arr[], int left, int right) {
    if (left < right) {
        int middle = left + (right - left) / 2;

        // Sort first and second halves
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);

        // Merge the sorted halves
        merge(arr, left, middle, right);
    }
}

// Function to print an array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}

// Main function
int main() {
    int arr[] = {12, 11, 13, 5, 6, 7};
    int arr_size = sizeof(arr) / sizeof(arr[0]);

    cout << "Given array is \n";
    printArray(arr, arr_size);

    mergeSort(arr, 0, arr_size - 1);

    cout << "\nSorted array is \n";
    printArray(arr, arr_size);
    return 0;
}