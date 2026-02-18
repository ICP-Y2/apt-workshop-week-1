# APT-Tutorial-Week-1

## Learning Logs - Tutorial 1 

When you are learning something new, it is easy to forget what you already studied.
For example, while learning programming or any technical subject, you may read many
resources and try many examples.

A **Learning Log** helps you:
- Keep track of topics you are learning
- Write down what you learned about each topic
- Review your learning later

This project helps you build a simple system to organize learning in one place.

---

## Objective
Create a **terminal-based Learning Logs application** using Java.


---

## Tasks to Complete

### Task 1: Topics 
- Allow the user to:
  - Add a new topic
  - View all topics
- Each topic has a name.

---
### Task 2: Entries 
- Allow the user to:
  - Add a learning entry under a topic
  - View learning entries
- Entries are short notes related to a topic.
## Bonus Tasks (For Practice)
-  View entries of a certain topic

---

## Constraints
- Terminal-based program only
- No file or database storage
- Use Java collections
- Keep the program simple and readable
---

### Some test cases

#### Topics 
| TC | Description                       | Input             | Expected Result                     |
| ----- | --------------------------------- | ----------------- | ----------------------------------- |
| 1    | Add a single topic                | `Programming`     | Topic is added successfully         |
| 2    | View topics when one topic exists | View Topics       | `Programming` is displayed          |
| 3    | View topics when no topics exist  | View Topics       | Message shown: No topics available  |
| 4    | Add a topic with empty name       | Press Enter       | Topic is not added                  |

#### Entries
| TC | Description                            | Input                                            | Expected Result                            |
| ----- | -------------------------------------- | ------------------------------------------------ | ------------------------------------------ |
| 1    | Add an entry to an existing topic      | Topic: `Programming`, Entry: `Learn Java basics` | Entry is added successfully                |
| 2    | View entries after adding one          | View Entries                                     | Entry is displayed under the correct topic |
| 3    | Add entry to a non-existing topic      | Topic: `History`                                 | Error or topic not found message           |
| 4    | View entries when no entries exist     | View Entries                                     | Message shown: No entries available        |

#### Bonus Task
| TC | Description                      | Input                          | Expected Result                |
| ----- | -------------------------------- | ------------------------------ | ------------------------------ |
| 1    | Prevent duplicate topic names    | `Programming` added twice      | Duplicate topic is not allowed |
| 2    | Improve topic search performance | Many topics                    | Topic is found efficiently     |
| 3    | Case-insensitive topic search    | `programming` vs `Programming` | Topic is matched correctly     |
