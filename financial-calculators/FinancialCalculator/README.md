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
- see code MortgageCalculator.java

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

## Future Value Calculator

This program helps you determine the **future value** of a one-time deposit (like a CD) 
that earns daily-compounded interest over a fixed period.

## Project Goal

To simulate real-world financial planning by allowing a user to:
- Input deposit amount, interest rate, and term
- Calculate how much their investment will grow with compound interest
- Understand how much of that total is earned interest

---

## Features

- User inputs:
    - **Initial Deposit**
    - **Annual Interest Rate (as a decimal, e.g., 0.045 for 4.5%)**
    - **Number of Years**
- Calculator computes:
    - **Future Value** using daily compounding
    - **Total Interest Earned**
- Displays results in the command prompt

## Learning Journey

### What I Struggled With

- **Missing prompts**: My early version didn’t prompt for interest rate or number of years, so the user didn't know what to input.
- **Spacing in string outputs**: My `System.out.println()` was hard to read until I switched to `System.out.printf()` formatting.
- **Naming consistency**: Some methods like `getFutureValueCalc` were renamed to be more intuitive (`calculateFutureValue`).
- **Compound interest logic**: Ensured I understood and applied the formula for **daily compounding**.

---

## Calculation Strategy

### Formula Used

Where:
- **FV** = Future Value
- **P** = Principal (initial deposit)
- **r** = Annual interest rate (decimal)
- **t** = Number of years
- **365** = Days per year for daily compounding
- **Total Interest** = Future Value - Principal

---

## Use Case Examples

| Deposit | Rate    | Years | Future Value | Interest Earned |
|---------|---------|--------|---------------|------------------|
| $1,000  | 1.75%   | 5      | $1,092.62     | $92.62           |
| $5,000  | 2.5%    | 10     | $6,410.53     | $1,410.53        |
| $10,000 | 4.25%   | 7      | $13,517.25    | $3,517.25        |

---

## Present Value calculator

A simple Java program built by Olumide Kolawole to calculate how much you need to invest **today** to receive regular payouts over time — based on the financial concept of a **present value annuity**.

---

## Project Goal

To simulate financial planning for retirement, pensions, or structured settlements by:
- Taking user input for future payouts and interest expectations
- Calculating the required investment today to meet those payouts
- Applying the standard Present Value of Annuity formula

---

## Features

- User inputs:
    - **Monthly payout amount**
    - **Expected annual interest rate** (as a decimal, e.g., 0.07625 for 7.625%)
    - **Number of years** the annuity will pay out
- Program computes:
    - **Present value of the annuity (PVA)** using standard formula
- Displays a clear, readable output

## Inputs &  Outputs

| Input Field           | Example Value |
|-----------------------|---------------|
| Monthly Payout        | 1000          |
| Annual Interest Rate  | 0.07625       |
| Number of Years       | 15            |

| Output Field          | Result Example |
|-----------------------|----------------|
| Present Value Annuity | $108,914.33    |

---

## Learning Journey

### What I Struggled With

- **Understanding the problem**: I initially wasn’t clear on whether we were paying or receiving money, or how interest compounding played into it.
- **Getting the final answer right**: My results were consistently **off by about $20,000** compared to verified examples — might need further refactor.
- **Number of periods**: I had to fully grasp that it means the **number of payments** (monthly), not years.
- **Confidence in my logic**: I built it cleanly but I'm taking a pause to step back and re-check the formula with real-world scenarios.

---

## Calculation Strategy

### Formula Used
PVA = P × (1 - (1 + r)^-n) / r

Where:
- **PVA** = Present Value of the Annuity
- **P** = Payment per period
- **r** = Interest rate per period (monthly)
- **n** = Number of periods (years × 12)

### Example:
- Payment: $1,000/month
- Years: 15
- Interest rate: 7.625% annual → 0.07625 ÷ 12 = 0.006354 monthly
- Periods: 15 × 12 = 180

---

## Use Case Examples

| Monthly Payment | Interest Rate | Years | Present Value Needed |
|-----------------|----------------|--------|------------------------|
| $1,000          | 7.625%         | 15     | ~$108,914.33           |
| $2,500          | 6.5%           | 20     | ~$342,116.92           |
| $1,200          | 5.0%           | 10     | ~$113,572.36           |


---
##  Notes for Future Improvement

- Recheck and refactor logic to align more precisely with verified results
- Separate calculation for converting annual rate to monthly rate

#### Erroneous inputs and error messages - screenshot
- This error kept happening because i didn't pass user results into parameter
and the console kept prompting user for new results going in a loop.
![parameter error](/Users/user/pluralsight/workshops/assets/loan term is buggy.png)
## Home Screen - screenshot

## Author
Olumide Kolawole
