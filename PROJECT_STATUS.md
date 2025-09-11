# Instagram Clone - Socially

This is a basic Instagram clone app with navigation between screens. Currently implemented screens:

## Completed Screens

### 1. Loading Screen (LoadingActivity)
- **Features:**
  - Shows "Socially" logo (using logo.xml vector drawable)
  - "from SMD" text at bottom
  - Status bar with time and icons
  - Auto-navigates to signup screen after 3 seconds
  - Bottom navigation indicator

### 2. Signup Screen (SignupActivity)  
- **Features:**
  - Instagram-like red background (#B85C5C)
  - Profile picture upload (circular CardView with camera icon)
  - Form fields: Username, Name, Last Name, Date of Birth, Email, Password
  - Pre-filled sample data as shown in design
  - Password visibility toggle (eye icon)
  - "Create an Account" button
  - Back arrow navigation
  - Scrollable form
  - Gallery picker for profile picture

## Project Structure

```
app/
├── src/main/
│   ├── java/com/bilalshakeel/i210575/
│   │   ├── MainActivity.kt (Entry point - launches LoadingActivity)
│   │   ├── LoadingActivity.kt (3-second loading screen)
│   │   └── SignupActivity.kt (User registration form)
│   ├── res/
│   │   ├── layout/
│   │   │   ├── activity_loading.xml (Loading screen layout)
│   │   │   └── activity_signup.xml (Signup form layout)
│   │   ├── drawable/ (All icons and logo vector drawable)
│   │   ├── values/
│   │   │   ├── colors.xml (Instagram-like color scheme)
│   │   │   ├── strings.xml (All text resources)
│   │   │   └── themes.xml (App themes)
│   │   └── ...
│   └── AndroidManifest.xml (Activities registration)
```

## Key Features Implemented

1. **XML Layouts**: Using traditional Android XML layouts (not Compose)
2. **ScrollView**: Signup form is scrollable
3. **CardView**: Used for profile picture and buttons
4. **Simple Widgets**: EditText, TextView, ImageView, LinearLayout, ConstraintLayout
5. **Navigation**: Automatic navigation from loading to signup
6. **Gallery Integration**: Can pick photos from gallery for profile picture
7. **Permission Handling**: Storage permissions for image access

## Colors Used

- **Instagram Red**: #B85C5C (main background for signup)
- **Light Brown**: #9B6B6B (accent color)
- **Dark Brown**: #8B4513 (darker accent)
- **White**: #FFFFFF (text and backgrounds)
- **Transparent White**: #80FFFFFF (button backgrounds)

## How to Run

1. Open the project in Android Studio
2. Make sure you have Java/JDK installed and configured
3. Build and run on device/emulator
4. App will start with loading screen, then navigate to signup

## Next Steps

Ready to implement the remaining 18 screens:
- Quick login screen
- Login screen  
- Main feed view
- Discover feed view
- Search feed view
- Inbox screen view
- Personal message screen
- Call view
- Notification feeds
- Profile views
- Story views
- Camera view
- Photo upload view
- And more...

Each screen will follow the same pattern with XML layouts and simple navigation.
