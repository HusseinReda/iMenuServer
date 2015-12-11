### Comments
-Meal CRUD operations works fine by manual (HTTP) testing
-Tests doesn't pass




### Usage

- Run the application and go on http://localhost:8080/
- Use the following urls to invoke controllers methods and see the interactions
  with the database:
    * `/create?email=[email]&name=[name]`: create a new user with an 
      auto-generated id and email and name as passed values.
    * `/delete?id=[id]`: delete the user with the passed id.
    * `/get-by-email?email=[email]`: retrieve the id for the user with the 
      passed email address.
    * `/update?id=[id]&email=[email]&name=[name]`: update the email and the 
      name for the user indentified by the passed id.
