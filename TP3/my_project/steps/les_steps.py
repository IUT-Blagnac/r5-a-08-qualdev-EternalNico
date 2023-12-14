from behave import given, when, then
from musique import Musique  

@given('the first number is {number}')
def step_given_first_number(context, number):
    context.first_number = int(number)

@given('the second number is {number}')
def step_given_second_number(context, number):
    context.second_number = int(number)

@when('the two numbers are added')
def step_when(context):
    context.result = context.first_number + context.second_number

@then('the result should be {expected_result}')
def step_then(context, expected_result):
    expected_result = int(expected_result)
    assert context.result == expected_result, f"Expected {expected_result}, but got {context.result}"

@given("I like listening {music}")
def step_given_like_listening_music(context, music):
    context.musique = Musique()
    context.musique.listen_music()

@when("{artist} drops an album Friday")
def step_when_album_dropped(context, artist):
    context.musique.drop_album()

@then("I {love} {artist}")
def step_then_love_kanye(context, love, artist):
    context.musique.love_kanye_now()
    assert context.musique.love_kanye, f"Expected to {love} {artist}, but do not."
