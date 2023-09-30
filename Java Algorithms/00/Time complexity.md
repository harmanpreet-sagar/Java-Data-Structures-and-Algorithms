# Time Complexity

Big-O notation allows us to compare algorithms independently of input size.

## Comparing Search Algorithms

### Algorithm 1

- The item we are searching for will be the first or last element in the list.
- O(1) or constant time as we are just picking the first or last element. (For
  both best and worst cases)

### Algorithm 2

- The item we are searching for could be anywhere within the list.
- Best case: first item checked -> O(1)
- Worst case: last item checked -> O(n) or linear

---

In deciding which algorithm to use, we often use the worst-case time complexity
as a deciding factor.

## Time Complexities

- O(1) or constant time
- O(log(n)) or Logarithmic time
- O(n<sup>2</sup>) or exponential time
- O(n!) or factorial time

Constant time is the best. Factorial Time is the worst.

---

We can use big-O notation to describe space complexity as well.

Big-O notation allows you to compare algorithms that perform the same task,
regardless of input size.
