class Solution {
    public int findPeakElement(int[] nums) {
        if (nums.length == 1) {
		return 0;
	}
	if (nums.length == 2) {
		return nums[0] > nums[1] ? 0 : 1;
	}
	int l = 0, r = nums.length - 1, m = 0;
	while (l <= r) {
		m = l + (r - l) / 2;

		if (m == 0 || m == nums.length - 1) {
			break;
		}

		// Check if x is present at m
		if (nums[m - 1] < nums[m] && nums[m] > nums[m + 1]) {
			return m;
		}

		// If x greater, ignore left half
		if (nums[m] < nums[m + 1]) {
			l = m + 1;
		}

		// If x is smaller, ignore right half
		else {
			r = m - 1;
		}
	}
	if (m == 0) {
		if (nums[m] > nums[m + 1]) {
			return m;
		} else if (nums[m + 1] > nums[m]) {
			return m + 1;
		}
	}
	if (m == nums.length - 1) {
		if (nums[m - 1] > nums[m]) {
			return m - 1;
		} else if (nums[m] > nums[m - 1]) {
			return m;
		}
	}
	return 0;
    }
}
