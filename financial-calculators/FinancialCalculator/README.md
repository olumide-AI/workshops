# Financial Calculator 
A Java-based collection of simple financial calculator built with IntelliJ.

## Project Goal

To build a clean, user-friendly, and accurate mortgage calculator that:
- Accepts user input (principal, interest rate, and loan term)
- Calculates monthly payments using compound interest
- Computes total interest paid over the loan's lifetime
- Displays results in a well-formatted, readable summary


## Features 
- Mortgage Calculator 
- Future Value Calculator 
- Present Value Calculator 

#### Mortgage Calculator 
- User enters:
    - **Loan/Principal amount**
    - **Annual interest rate (decimal form, e.g., 0.07625 for 7.625%)**
    - **Loan term (years)**
- Program calculates:
    - **Monthly interest rate**
    - **Monthly payment**
    - **Total interest paid**
  
#### Code Behaviour 
##### Code input
- **Principal/Loan Amount:** How much money the user is borrowing 
- **Interest Rate:** Usually annual, e.g., 5% per year.
- **Loan Term:** The duration of the loan, Usually in years

##### Code Output
- **Monthly Payment Amount:** The fixed amount to be paid each month.
- **Total Payment:** Total amount paid over the life of the loan.
- **Total Interest:** Total interest paid over the life of the loan.

##### Code Features
- Validates that all input values are positive and reasonable.
- Rounds output values to 2 decimal places (currency format).

##### Use case examples
| Loan Amount | Interest Rate | Term (Years) | Monthly Payment | Total Interest |
|-------------|----------------|---------------|------------------|----------------|
| $100,000    | 5%             | 30            | $536.82          | $93,256.40     |
| $250,000    | 3.5%           | 15            | $1,787.21        | $71,697.80     |
| $180,000    | 4.25%          | 20            | $1,113.23        | $87,175.20     |
| $350,000    | 6%             | 30            | $2,098.43        | $405,434.80    |


#### Code Strategy
##### Code Formula 
- loanTerm = years the loan last
- principal = total amount of loan
- monthlyPay = (monthlyIntRate*(1+monthlyIntRate)**noMonthlyPay) / ((1+monthlyIntRate)**noMonthlyPay)-1)
- annualIntRate = 0.07625 or 7.625%
- monthlyIntRate = annualIntRate/12
- noMonthlyPay = 12 * loanTerm
- totalInt = (monthlyPay*noMonthlyPay)-principal


#### Code Implementation

## Learning Journey
### What I Struggled With

- **Method design**: Initially had methods that re-prompted for input every time they were called, leading to confusing loops and repeated prompts.
- **Understanding method parameters**: Learned that passing variables into methods (like `principal`, `rate`, and `term`) prevents re-prompting and keeps logic clean.
- **Scanner reuse**: Realized that closing `Scanner` too early or using it in multiple places caused `NoSuchElementException`. Solution: pass one `Scanner` into all input methods.
- **Java printf** formatting: Learned how to use `System.out.printf()` to format money, percentages, and make output user-friendly.

### Fixes Applied

- Created **one `Scanner`** in `main()` and passed it into all input methods.
- Stored input once, then reused values in calculation methods.
- Updated `displayResults()` to accept **all needed values as parameters**, so it can present a complete example-style summary.
- Used `System.out.printf()` for proper currency formatting.

#### Mortgage Calculator Screen - screenshot

#### Erroneous inputs and error messages - screenshot
- This error kept happening because i didn't pass user results into parameter
and the console kept prompting user for new results going in a loop. 

## Home Screen - screenshot

## Author
Olumide Kolawole
