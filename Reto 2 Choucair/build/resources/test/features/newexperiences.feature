@stories
Feature: NewExperiences

  As a user I want to enter the NewExperience page to buy the printed dresses

  @scenario1
    #Cambiar Data antes de ejecutar
  Scenario: buy an Dress in the pag new experience

    Given than maria wants to enter the page new experience
    When the search the dress in the New Experience
      | email                | first_Name | last_name | password | day | month | year | address | city    | state | postal_code | mobile_phone | address3 |
      | ana@hotmail.com | Ana  | gomez    | ana23335 | 5   | 6     | 1992 | Street  | Houston | 31    | 07636       | 33467256     | Street45 |

    Then She finds the dress called Printed Chiffon Dress
      | message                             |
      | Your order on My Store is complete. |