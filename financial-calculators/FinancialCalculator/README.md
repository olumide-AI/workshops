# Financial Calculator 
A Java-based collection of simple financial calculators built with IntelliJ.

## Features 
- Mortgage Calculator 
- Future Value Calculator 
- Present Value Calculator 

## Mortgage Calculator 

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

#### Mortgage Calculator Screen - screenshot

#### Erroneous inputs and error messages - screenshot

## Home Screen - screenshot

## Author
Olumide Kolawole
