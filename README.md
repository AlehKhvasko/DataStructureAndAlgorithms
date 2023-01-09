What is Big O?

Big O notation is the language we use for talking about how long an algorithm takes to run.
It's how we compare the efficiency of different approaches to a problem.
It's like math except it's an awesome, not-boring kind of math where you get to wave your hands through the details and just focus on what's basically happening.
With big O notation we express the runtime in terms of—brace yourself—how quickly it grows relative to the input, as the input gets arbitrarily large.

What is Big Omega?

Big Omega describes the lower bound of an algorithm.
Using our Insertion Sort example, if the input is already sorted, then the rate of growth of our algorithm is at least linear, or Ω(n).
If only life always handed us sorted arrays. 🌼
We can also think of this as our best-case scenario.

What is Big Theta?

Big Theta describes the tight bound of an algorithm, it’s limit from above and below.
