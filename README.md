# 420-911-VA - Programming Concepts 1 Course Project

Vanier College <br />
Date: 6 December 2024<br />

Author:

- Dickson Lee (2495196)
- Rishard Mohamed Gulam Mohamed (2495235)

## Overview

This project aims to bring together the concepts and techniques learned in the course by designing and implementing an event-driven
simulation in Java. You will develop a complete, functional application using object-oriented principles and Java programming features.
The goal is to simulate a dynamic system where _events trigger changes in state or behavior_, reinforcing your problem-solving and programming skills.

# Project Idea: Simulate a Grocery Shopping Experience

## Division of Work

### Rishard

1. Create the Item class:

   - Attributes: name and price.
   - Constructor, getters, and setters.

2. Create the structure of the GroceryStore class: (removed)
3. Write a method in the GroceryStore class to calculate the total cost of items in the cart.

### Dickson

Focus: User experience, checkout process, and receipt generation.

1. Handle Item Selection

   - Write a method to display the list of items and prompt the user to select items by number.
   - Switch function to allow users to add multiple items to their cart until they decide to finish shopping.
   - Add selected items to the basket
   - Remove items from basket

2. Generate Receipt

   - Write a method to generate a receipt file
   - List purchased items and their prices.
   - Print Writer to save the receipt as a text file.

3. Testing Frontend and File Handling

   - Test the item selection process, payment handling, and receipt generation

## Collaboration and Integration

1. Rishard and Dickson:

   - Collaborate to integrate the backend with the user interaction and file handling.

2. Testing Together:

   - Test the complete program to ensure seamless interaction between item selection, checkout, and receipt generation.

3. Documentation:

   - Document your respective work with comments for clarity and easy debugging.

## Responsibility Summary

| Task                                 | Assigned to       |
| ------------------------------------ | ----------------- |
| Class Creation (Item, GroceryStore)  | Rishard           |
| Predefined Item List                 | Dickson           |
| Calculate Total Cost                 | Rishard           |
| User Interaction (Item Selection)    | Dickson           |
| Checkout Process                     | Dickson & Rishard |
| Receipt Generation and File Handling | Dickson           |
| Final Integration and Debugging      | Dickson           |
