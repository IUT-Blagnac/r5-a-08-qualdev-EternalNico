Feature: Music
    Scenario Outline: I love Kanye when he drops an album
        Given <love> like listening <music>
        When <artist> West drops an album Friday
        Then <love> love <artist>

Examples:
    | love     | music    | artist   |
    | I        | love     | kanye    |