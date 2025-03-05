import { StyleSheet, Text, View } from 'react-native';


import { CommSetting, ManageRequest, PosLink, POSLinkAndroid } from 'expo-pax-poslink';

import { useEffect } from 'react';
import { InputAccountWithEmvRequest } from 'expo-pax-poslink/ManageRequest';

export default function App() {
  useEffect(() => {
    try {
      POSLinkAndroid.init();
      const cs = new CommSetting();
      cs.type = "AIDL";
      cs.timeOut = '3000';
      const pos = new PosLink();
      pos.setCommSetting(cs);
      const req = new InputAccountWithEmvRequest('5000');
      req.contactEMVEntryFlag = '1';

      pos.manageRequest = req;
      const result = pos.processTrans();
      console.log("Result Code is " + result?.code)
      console.log("Because....  " + result?.message)
    }
    catch (ex: any) {
      console.log(ex.message)
    }

  }, [])
  return (
    <View style={styles.container}>
      <Text>HELLO MOTTO</Text>
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
