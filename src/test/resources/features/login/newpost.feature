Feature: New Post

  Scenario: Create a new post with a new category
    Given Juan has an active account
    When he sends their valid credentials
    Then he should have access to the blog page
    Given Juan wants create a new blog category
    When he fills all the fields
    Then he should be find it into the category list
    Given Juan wants create a new post
    When he complete all the fields
    Then he should be find it into the post list