# Lazy Lists in Compose — Course Starter

This repository contains a small Jetpack Compose starter project for learning how to build 
scrollable lists with `LazyColumn`. The provided starter files show a simple counting-by-steps list 
and an app entry point. The exercise asks you to create your own lazy list composable that accepts
a list of items to be displayed inside `MainActivity`.

## Getting started

1. Clone the repository by opening a terminal and running:
   ```
   git clone https://github.com/ajsherrell/LazyListExample.git
2. Open the project you just cloned in Android Studio.
3. Let the gradle sync run and build the project: `Build > Make Project`.
4. Run on an emulator or device: `Run > Run 'app'`.
5. Use the Compose preview pane to view composables during development.

## Included starter files

- `MainActivity.kt`  
  Sets the Compose host, calls `setContent`, wraps UI in the app theme and a `Scaffold`.
The scaffold lambda provides `innerPadding` — apply this so your content avoids system/scaffold insets.

- `CountListCompose.kt`  
  Contains a lazy list composable that displays numbers counting by a specified step.

- `CountBySteps.kt`  
  Provides a class that renders items by a numeric step using Kotlin's built-in Iterator.

### Starter Image:


## Exercise (do not copy the solution)

Create a new Compose file and a new lazy list composable that takes a list of items.

Requirements
- Add a new file (for example `YourLazyList.kt`) in the same package.
- Implement a composable with a clear public signature such as:
    - `@Composable fun YourLazyList(items: List<String>, modifier: Modifier = Modifier) { ... }`
- Make the list scrollable and ensure it respects `innerPadding` coming from `Scaffold`.
- Call your new composable from `MainActivity.kt`, providing a sample `List<String>`.

Acceptance criteria
- The app displays the new list when run.
- The list scrolls smoothly.
- The composable does not draw under system bars because `innerPadding` (or equivalent) is applied.
- Add a `@Preview` for your composable with a small sample list.

Hints (don’t reveal the full solution)
- Use `LazyColumn` and add the `items` to render a list.
- Give your composable a `modifier: Modifier = Modifier` parameter and apply it to the `LazyColumn`.
- Apply scaffold insets with `Modifier.padding(innerPadding)` where `innerPadding` is the scaffold lambda parameter.
- For each row, a simple `Text` is enough to start.

Stretch goals
- Add `horizontalPadding` or `verticalPadding` if you want consistent spacing.
- Add text decoration or styling to list items.
- Add tests or UI tests for your composable.

## Notes for instructors
- Starter code demonstrates composable structure, themes, and preview setup.
- The exercise encourages correct use of `Modifier` and `Scaffold` insets without giving away the full implementation.
