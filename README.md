### Interface


### BankAccount Class
* Members are all private + Provide Getter & Setter
  
Create the following Members:
1. [X] Account Holder Name (String)
2. [X] Random Generated Account Number (String)
3. [X] Account Balance (Float)
4. [X] Transactions (List of Strings)
5. [X] Account isClosed? (Boolean)
6. [X] Created Date (Long)
7. [X] Closed Date (Long) 


Delete the setMethod for the following:
1. [X] Account Holder Name (String)
2. [X] Random Generated Account Number (String)

Add the following constructor to Bank Account:
1. [X] Bank Account
   a. [X] Single parameter(string)
   b. [X] Initialise balance to 0

2. [X] Bank Account
   a. [X] Two parameters(string, float)


Create the following Methods:
1. [X] deposit
2. [X] withdraw


Deposit method does the following:
1. User inputs an amount
2. Add the String "Deposit $<user input> at <created date time> to transaction list


Withdraw method does the following:
1. User inputs an amount
2. Add the String "Withdaw $<user input> at <created date tiime>
3. Only allows positive number. If an incorrect amouns is given throw IllegalArgumentException


### Main Class
1. [X] Create a new user
2. [X] Create a random bank account number with the user
3. [X] User can withdaw x amount of money and it will log it in the transaction list