func mergeAlternately(word1 string, word2 string) string {

	rune1 := []rune(word1)
	rune2 := []rune(word2)

	n, m := len(rune1), len(rune2)

	result := make([]rune, 0, n+m)

	for i := 0; i < max(n, m); i++ {
		if i < n {
			result = append(result, rune1[i])
		}
		if i < m {
			result = append(result, rune2[i])
		}
	}
	return string(result)
}