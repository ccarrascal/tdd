# TTD (Test Driven Design)

Testing Java app using JUNIT


### String calculator code Kata

1. Create a StringCalculator with an add method int add(String numbers)

	a. The method can receive 0, 1 or 2 numbers. For example: "", "1" or "1,2"
	b. Begin with the simplest test case, an empty string, and then continue 
			with one and two numbers.
	c. Try to write simple solutions to discover tests in which we haven't think
			beforehand.

	Remember to refactor the code after each test.

2. Allow the method to receive more that two numbers.

3. Change the test to use Hamcrest matchers.

4. Does StringCalculator comply with the unique responsibilty principle ?
		Split StringCalculator and StringSplitter

5. Allow the method add to use new lines as separator.

	a. "1\n2,3" should return 6
	b. "1,\n" is not a valid string ??


6. Allow custom list separators

	a. To change delimiter, we use "//[delimiter]\n[numbers]". For example: "//;\n1;2" should return 3
	b. This is optional, the older format cases are still valid


TODO:

7. Do we have good tests?

	a. Break on purpose the StringSplitter implementation. 
	b. Run all tests. Then:
			* StringCalculator tests should pass
			* StringSplitter tests should fail


# More info & related

## Testing with Spock

https://goo.gl/5ry439


## Madrid Java JUG Page

www.meetup.com/es/MadridJUG/