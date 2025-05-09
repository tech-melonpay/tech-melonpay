package org.bouncycastle.tls;

import java.util.Vector;

/* loaded from: classes3.dex */
class DTLSReassembler {
    private byte[] body;
    private Vector missing;
    private short msg_type;

    public static class Range {
        private int end;
        private int start;

        public Range(int i, int i9) {
            this.start = i;
            this.end = i9;
        }

        public int getEnd() {
            return this.end;
        }

        public int getStart() {
            return this.start;
        }

        public void setEnd(int i) {
            this.end = i;
        }

        public void setStart(int i) {
            this.start = i;
        }
    }

    public DTLSReassembler(short s10, int i) {
        Vector vector = new Vector();
        this.missing = vector;
        this.msg_type = s10;
        this.body = new byte[i];
        vector.addElement(new Range(0, i));
    }

    public void contributeFragment(short s10, int i, byte[] bArr, int i9, int i10, int i11) {
        int i12 = i10 + i11;
        if (this.msg_type == s10 && this.body.length == i && i12 <= i) {
            int i13 = 0;
            if (i11 == 0) {
                if (i10 == 0 && !this.missing.isEmpty() && ((Range) this.missing.firstElement()).getEnd() == 0) {
                    this.missing.removeElementAt(0);
                    return;
                }
                return;
            }
            while (i13 < this.missing.size()) {
                Range range = (Range) this.missing.elementAt(i13);
                if (range.getStart() >= i12) {
                    return;
                }
                if (range.getEnd() > i10) {
                    int max = Math.max(range.getStart(), i10);
                    int min = Math.min(range.getEnd(), i12);
                    System.arraycopy(bArr, (i9 + max) - i10, this.body, max, min - max);
                    if (max != range.getStart()) {
                        if (min != range.getEnd()) {
                            i13++;
                            this.missing.insertElementAt(new Range(min, range.getEnd()), i13);
                        }
                        range.setEnd(max);
                    } else if (min == range.getEnd()) {
                        this.missing.removeElementAt(i13);
                        i13--;
                    } else {
                        range.setStart(min);
                    }
                }
                i13++;
            }
        }
    }

    public byte[] getBodyIfComplete() {
        if (this.missing.isEmpty()) {
            return this.body;
        }
        return null;
    }

    public short getMsgType() {
        return this.msg_type;
    }

    public void reset() {
        this.missing.removeAllElements();
        this.missing.addElement(new Range(0, this.body.length));
    }
}
