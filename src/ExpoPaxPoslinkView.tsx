import { requireNativeViewManager } from 'expo-modules-core';
import * as React from 'react';

import { ExpoPaxPoslinkViewProps } from './ExpoPaxPoslink.types';

const NativeView: React.ComponentType<ExpoPaxPoslinkViewProps> =
  requireNativeViewManager('ExpoPaxPoslink');

export default function ExpoPaxPoslinkView(props: ExpoPaxPoslinkViewProps) {
  return <NativeView {...props} />;
}
