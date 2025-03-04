import { StyleSheet, Text, View } from 'react-native';

import * as ExpoPaxPoslink from 'expo-pax-poslink';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>{ExpoPaxPoslink.hello()}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
