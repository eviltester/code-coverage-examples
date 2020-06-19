# Code Coverage Examples

Todo:
- examples of different coverage types
- show difference between test coverage and usage/execution coverage
- how mocking impacts coverage - more target test coverage, reduced usage/execution coverage
- how to assess coverage when not mocking? more targetted execution during review


Measures:

- measure of untested code - when the tests are designed to cover the 'unit', and run against the unit
- measure of unexercised code - when code is 'used' during tests, coverage run against full code base
- measure of quality of tests - no

Formal Definitions:

- https://en.wikipedia.org/wiki/Code_coverage

- Function Coverage - has a function been called (can be covered by statement coverage)


Main Types of code coverage:

- statement
- branch  `if(a<1 || a>10)`
- condition `(a<1)`, `(a>10)`  [if the `||` was an `&&` then it would be 1 condition]

Different languages have different coverage requirements

- argument e.g. if a function has 'default' arguments

Coverage that is hard to measure:

- argument value scope e.g. null, empty array, array of different sizes
    - manual review
    - property based testing
    - mutation testing


Usage:

- Use coverage to evaluate design, after you've written the tests.
- With TDD, use coverage as part of your refactor stage to evaluate your design.
    - Note: TDD often creates different code than test after


maven can split coverage reporting of unit and integration tests
- unit - test
- integration - during verify
- rather than CI plugin, example using maven


## References to consider

Brian Marick - How to Misuse code coverage

http://www.exampler.com/testing-com/writings/coverage.pdf

Recommends evaluating code as High, Medium and Low risk, and testing the high risk code more. The examples given are 'risk of business impact', so that makes sense.

I try to architect the code so it has low technical risk, and still try to achieve a high test coverage. But High, Medium and Low risk is a useful guide for reviewing the quality of the tests as well as the coverage achieved by the tests.


Martin Fowler - Test Coverage

- https://martinfowler.com/bliki/TestCoverage.html

"If you are testing thoughtfully and well, I would expect a coverage percentage in the upper 80s or 90s. I would be suspicious of anything like 100% - it would smell of someone writing tests to make the coverage numbers happy, but not thinking about what they are doing."

- Or 100% coverage being used during the Unit Testing and Review to achieve high coverage of code that can be tested at a unit level to make the integration 'exercised' measures more useful.

 "like a simple change to code causes excessively long changes to tests, that's a sign that there's a problem with the tests. This may not be so much that you are testing too many things, but that you have duplication in your tests."


---

Notes:

Some people avoid writing tests for getters and setters.

Perhaps if we don't want to test the getters and setters, we shouldn't create getters and setters. Perhaps we should only set values in the constructor, perhaps we don't 'get' fields we 'ask the class for answers'.

