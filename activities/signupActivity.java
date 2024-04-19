<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity4">

    <ImageView
        android:id="@+id/imageView2"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scaleType="centerCrop"
        android:src="@mipmap/background_dark_foggy"
        tools:layout_editor_absoluteX="0dp"
        tools:layout_editor_absoluteY="0dp"></ImageView>

    <ImageView
        android:id="@+id/goalGuideDark"
        android:layout_width="241dp"
        android:layout_height="168dp"
        android:layout_marginStart="10dp"
        android:layout_marginTop="20dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:srcCompat="@mipmap/logo_dark" />

    <TextView
        android:id="@+id/unlockTxtDark"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:fontFamily="@font/zen_dots"
        android:lineSpacingExtra="8sp"
        android:text="Unlock Your\nPotencial"
        android:textAlignment="center"
        android:textColor="@color/white"
        app:layout_constraintBottom_toBottomOf="@+id/goalGuideDark"
        app:layout_constraintStart_toStartOf="@+id/guideline5"
        app:layout_constraintTop_toTopOf="@+id/goalGuideDark" />

    <TextView
        android:id="@+id/welcomeMesDark"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:fontFamily="@font/zen_dots"
        android:text="Welcome, Player"
        android:textColor="@color/white"
        android:textSize="25sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/goalGuideDark" />

    <Button
        android:id="@+id/withAccDark"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:backgroundTint="#00FFFFFF"
        android:fontFamily="@font/zen_dots"
        android:text="Already have an account? Login!"
        android:textColor="@color/light_blue_title"
        android:textSize="10sp"
        app:layout_constraintBottom_toBottomOf="@+id/imageView2"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/termsCheck" />

    <Button
        android:id="@+id/signupBttDark"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:alpha="0.9"
        android:background="@mipmap/rectangle"
        android:fontFamily="@font/zen_dots"
        android:padding="25sp"
        android:text="Sign Up"
        android:textColor="@color/blue_texts"
        android:textSize="16sp"
        app:backgroundTint="@color/light_gray_buttons"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/countryDark" />

    <EditText
        android:id="@+id/usernameDark"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:alpha="0.7"
        android:background="@mipmap/rectangle2"
        android:ems="10"
        android:fontFamily="@font/zen_dots"
        android:hint="Enter username"
        android:inputType="text"
        android:paddingTop="15sp"
        android:paddingBottom="15sp"
        android:textAlignment="center"
        android:textColor="@color/dark_blue_back"
        android:textColorHint="@color/dark_blue_back"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.495"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/createTxt" />


    <EditText
        android:id="@+id/passDark"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:alpha="0.7"
        android:background="@mipmap/rectangle2"
        android:ems="10"
        android:fontFamily="@font/zen_dots"
        android:hint="Enter password"
        android:inputType="textPassword"
        android:paddingTop="15sp"
        android:paddingBottom="15sp"
        android:textAlignment="center"
        android:textColor="@color/dark_blue_back"
        android:textColorHint="@color/dark_blue_back"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.504"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/usernameDark" />

    <EditText
        android:id="@+id/emailDark"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:alpha="0.7"
        android:background="@mipmap/rectangle2"
        android:ems="10"
        android:fontFamily="@font/zen_dots"
        android:hint="Enter email"
        android:inputType="text"
        android:paddingTop="15sp"
        android:paddingBottom="15sp"
        android:textAlignment="center"
        android:textColor="@color/dark_blue_back"
        android:textColorHint="@color/dark_blue_back"
        android:textSize="14sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.504"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/passDark" />

    <androidx.constraintlayout.widget.Guideline
        android:id="@+id/guideline5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintGuide_percent="0.5" />

    <ImageView
        android:id="@+id/imageView3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginEnd="10dp"
        app:layout_constraintBottom_toBottomOf="@+id/passDark"
        app:layout_constraintEnd_toEndOf="@+id/passDark"
        app:layout_constraintTop_toTopOf="@+id/passDark"
        app:srcCompat="@mipmap/eye_dark" />

    <Spinner
        android:id="@+id/countryDark"
        android:layout_width="300dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:alpha="0.7"
        android:entries="@array/countries"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/emailDark" />

    <TextView
        android:id="@+id/createTxt"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="5dp"
        android:fontFamily="@font/zen_dots"
        android:text="Create your account"
        android:textColor="@color/white"
        android:textSize="12sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/welcomeMesDark" />

    <CheckBox
        android:id="@+id/termsCheck"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:buttonTint="@color/light_blue_title"
        android:fontFamily="@font/zen_dots"
        android:text="I agree with the Terms of Service *"
        android:textColor="@color/light_blue_title"
        android:textSize="12sp"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/signupBttDark" />

</androidx.constraintlayout.widget.ConstraintLayout>
