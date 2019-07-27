Feature: User can follow and unfollow an artist
  To follow an artist to get updates about his songs
  as and Spotify User
  user should be able to follow his favorite artist

  Scenario Outline: User can follow an artist

    Given Sergey has signed in with his account
    And he search for the artist <artist>
    When he follows the artist <artist>
    Then he should see that he is now following <artist>
    Examples:
      | artist                |
      | andres calamaro       |
      | Los cuates de sinaloa |

  Scenario Outline: User can unfollow an artist

    Given Sergey has signed in with his account
    And he search for the artist <artist>
    When he unfollows the artist <artist>
    Then he should see that he is now not following <artist>
    Examples:
      | artist                |
      | andres calamaro       |
      | Los cuates de sinaloa |
