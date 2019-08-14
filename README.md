
# react-native-hide-navigator-android

## Getting started

`$ npm install react-native-hide-navigator-android --save`

### Mostly automatic installation

`$ react-native link react-native-hide-navigator-android`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.henry.hidenavigator.RNHideNavigatorPackage;` to the imports at the top of the file
  - Add `new RNHideNavigatorPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-hide-navigator-android'
  	project(':react-native-hide-navigator-android').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-hide-navigator-android/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-hide-navigator-android')
  	```


## Usage
```javascript
import RNHideNavigator from 'react-native-hide-navigator-android';

// TODO: What to do with the module?
RNHideNavigator;
```
