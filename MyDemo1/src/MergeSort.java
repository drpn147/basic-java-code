import java.util.Arrays;

public class MergeSort {
	void mergesort(int array[], int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = array[p + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = array[q + 1 + j];
		}

		int i, j, k;
		i = 0;
		j = 0;	
		k = p;

		while (i < n1 && j < n2) {
			if (L[i] < R[j]) {
				array[k] = L[i];
				i++;
			} else {
				array[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			array[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			array[k] = R[j];
			j++;
			k++;
		}

	}

	void Merge(int array[], int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;
			Merge(array, left, mid);
			Merge(array, mid + 1, right);
			mergesort(array, left, mid, right);

		}

	}

	public static void main(String arg[]) {
		int data[] = { 23, 21, 12, 34, 43 };
		MergeSort m = new MergeSort();
		int len = data.length - 1;
		m.Merge(data, 0, len);
		System.out.println(Arrays.toString(data));
	}

}
