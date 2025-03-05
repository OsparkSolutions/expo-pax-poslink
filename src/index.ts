// Import the native module. On web, it will be resolved to ExpoPaxPoslink.web.ts
// and on native platforms to ExpoPaxPoslink.ts

import CommSetting from './CommSetting';
import PosLink from './PosLink';
import ManageRequest from './ManageRequest';
import ManageResponse from './ManageResponse';
import ProcessTransResult from './ProcessTransResult';


export { POSLinkAndroid } from './ExpoPaxPoslink';
export { CommSetting, PosLink, ManageRequest, ManageResponse, ProcessTransResult }