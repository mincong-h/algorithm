func canPermutePalindrome(s string) bool {
	counter := make([]int, 256)
	for _, c := range s {
		counter[c]++
	}
	isEvenPalindrome := false
	for _, val := range counter {
		if val%2 == 1 {
			if !isEvenPalindrome {
				isEvenPalindrome = true
			} else {
				return false
			}
		}
	}
	return true
}
