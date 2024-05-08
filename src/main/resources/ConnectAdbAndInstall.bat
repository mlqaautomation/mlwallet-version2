@echo off

set DEVICE_IPS=127.0.0.1:5555 127.0.0.1:5557 127.0.0.1:5559 127.0.0.1:5561 emulator-5554
set APK_FILE=mlwallet-app.apk

echo Connecting to devices...

for %%I in (%DEVICE_IPS%) do (
    echo Connecting to device %%I...
    adb connect %%I
)

echo Installing APK on connected devices...

for %%I in (%DEVICE_IPS%) do (
    echo Installing APK on device %%I...
    adb -s %%I install %APK_FILE%
)

echo Installation completed on all devices.