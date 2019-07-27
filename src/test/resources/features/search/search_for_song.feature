Feature: Search for a song
  To check if a song exist in an application
  as an spotify user
  user should be able to search for a song

  Scenario Outline: Search a song
    Given Sergey has signed in with his account
    When he search for the song <song> of <artist>
    Then he should see that song exist in spotify
    Examples:
      | song    | artist        |
      | bad guy | Billie Eilish |
