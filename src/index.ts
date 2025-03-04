import { NativeModulesProxy, EventEmitter, Subscription } from 'expo-modules-core';

// Import the native module. On web, it will be resolved to ExpoPaxPoslink.web.ts
// and on native platforms to ExpoPaxPoslink.ts
import ExpoPaxPoslinkModule from './ExpoPaxPoslinkModule';
import ExpoPaxPoslinkView from './ExpoPaxPoslinkView';
import { ChangeEventPayload, ExpoPaxPoslinkViewProps } from './ExpoPaxPoslink.types';

// Get the native constant value.
export const PI = ExpoPaxPoslinkModule.PI;

export function hello(): string {
  return ExpoPaxPoslinkModule.hello();
}

export async function setValueAsync(value: string) {
  return await ExpoPaxPoslinkModule.setValueAsync(value);
}

const emitter = new EventEmitter(ExpoPaxPoslinkModule ?? NativeModulesProxy.ExpoPaxPoslink);

export function addChangeListener(listener: (event: ChangeEventPayload) => void): Subscription {
  return emitter.addListener<ChangeEventPayload>('onChange', listener);
}

export { ExpoPaxPoslinkView, ExpoPaxPoslinkViewProps, ChangeEventPayload };
