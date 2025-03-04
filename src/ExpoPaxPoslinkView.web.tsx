import * as React from 'react';

import { ExpoPaxPoslinkViewProps } from './ExpoPaxPoslink.types';

export default function ExpoPaxPoslinkView(props: ExpoPaxPoslinkViewProps) {
  return (
    <div>
      <span>{props.name}</span>
    </div>
  );
}
