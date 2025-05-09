package org.jmrtd.io;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import s3.b;

/* loaded from: classes3.dex */
public class FragmentBuffer implements Serializable {
    private static final int DEFAULT_SIZE = 2000;
    private static final long serialVersionUID = -3510872461790499721L;
    private byte[] buffer;
    private Collection<Fragment> fragments;

    public static class Fragment implements Serializable {
        private static final long serialVersionUID = -3795931618553980328L;
        private int length;
        private int offset;

        private Fragment(int i, int i9) {
            this.offset = i;
            this.length = i9;
        }

        public static Fragment getInstance(int i, int i9) {
            return new Fragment(i, i9);
        }

        public boolean equals(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            if (!obj.getClass().equals(Fragment.class)) {
                return false;
            }
            Fragment fragment = (Fragment) obj;
            return fragment.offset == this.offset && fragment.length == this.length;
        }

        public int getLength() {
            return this.length;
        }

        public int getOffset() {
            return this.offset;
        }

        public int hashCode() {
            return (this.length * 3) + (this.offset * 2) + 5;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("[");
            sb2.append(this.offset);
            sb2.append(" .. ");
            sb2.append((this.offset + this.length) - 1);
            sb2.append(" (");
            return b.m(sb2, this.length, ")]");
        }
    }

    public FragmentBuffer() {
        this(DEFAULT_SIZE);
    }

    private void setLength(int i) {
        synchronized (this) {
            try {
                byte[] bArr = this.buffer;
                if (i <= bArr.length) {
                    return;
                }
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                this.buffer = bArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void addFragment(int i, byte b9) {
        addFragment(i, new byte[]{b9});
    }

    public synchronized boolean equals(Object obj) {
        boolean z10 = false;
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!obj.getClass().equals(FragmentBuffer.class)) {
            return false;
        }
        FragmentBuffer fragmentBuffer = (FragmentBuffer) obj;
        byte[] bArr = fragmentBuffer.buffer;
        if (bArr == null && this.buffer != null) {
            return false;
        }
        if (bArr != null && this.buffer == null) {
            return false;
        }
        Collection<Fragment> collection = fragmentBuffer.fragments;
        if (collection == null && this.fragments != null) {
            return false;
        }
        if (collection != null && this.fragments == null) {
            return false;
        }
        if (Arrays.equals(bArr, this.buffer)) {
            if (fragmentBuffer.fragments.equals(this.fragments)) {
                z10 = true;
            }
        }
        return z10;
    }

    public byte[] getBuffer() {
        return this.buffer;
    }

    public synchronized int getBufferedLength(int i) {
        int i9;
        int i10 = 0;
        if (i >= this.buffer.length) {
            return 0;
        }
        for (Fragment fragment : this.fragments) {
            int offset = fragment.getOffset();
            int offset2 = fragment.getOffset() + fragment.getLength();
            if (offset <= i && i < offset2 && (i9 = offset2 - i) > i10) {
                i10 = i9;
            }
        }
        return i10;
    }

    public synchronized int getBytesBuffered() {
        int i;
        i = 0;
        for (int i9 = 0; i9 < this.buffer.length; i9++) {
            if (isCoveredByFragment(i9)) {
                i++;
            }
        }
        return i;
    }

    public Collection<Fragment> getFragments() {
        return this.fragments;
    }

    public int getLength() {
        int length;
        synchronized (this) {
            length = this.buffer.length;
        }
        return length;
    }

    public synchronized int getPosition() {
        int i;
        i = 0;
        for (int i9 = 0; i9 < this.buffer.length; i9++) {
            if (isCoveredByFragment(i9)) {
                i = i9 + 1;
            }
        }
        return i;
    }

    public synchronized Fragment getSmallestUnbufferedFragment(int i, int i9) {
        int i10;
        try {
            Iterator<Fragment> it = this.fragments.iterator();
            i10 = i;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Fragment next = it.next();
                if (next.getOffset() <= i10 && i10 + i9 <= next.getOffset() + next.getLength()) {
                    i9 = 0;
                    break;
                }
                if (next.getOffset() <= i10 && i10 < next.getOffset() + next.getLength()) {
                    int offset = next.getOffset() + next.getLength();
                    i9 = (i10 + i9) - offset;
                    i10 = offset;
                } else if (i10 > next.getOffset() || next.getOffset() + next.getLength() > i10 + i9) {
                    if (i <= next.getOffset() && next.getOffset() < i10 + i9) {
                        i9 = next.getOffset() - i10;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return Fragment.getInstance(i10, i9);
    }

    public int hashCode() {
        return (this.fragments.hashCode() * 2) + (Arrays.hashCode(this.buffer) * 3) + 7;
    }

    public synchronized boolean isCoveredByFragment(int i) {
        return isCoveredByFragment(i, 1);
    }

    public synchronized String toString() {
        return "FragmentBuffer [" + this.buffer.length + ", " + this.fragments + "]";
    }

    public synchronized void updateFrom(FragmentBuffer fragmentBuffer) {
        for (Fragment fragment : fragmentBuffer.fragments) {
            addFragment(fragment.offset, fragmentBuffer.buffer, fragment.offset, fragment.length);
        }
    }

    public FragmentBuffer(int i) {
        this.buffer = new byte[i];
        this.fragments = new HashSet();
    }

    public synchronized boolean isCoveredByFragment(int i, int i9) {
        for (Fragment fragment : this.fragments) {
            int offset = fragment.getOffset();
            int offset2 = fragment.getOffset() + fragment.getLength();
            if (offset <= i && i + i9 <= offset2) {
                return true;
            }
        }
        return false;
    }

    public synchronized void addFragment(int i, byte[] bArr) {
        addFragment(i, bArr, 0, bArr.length);
    }

    public synchronized void addFragment(int i, byte[] bArr, int i9, int i10) {
        int i11 = i + i10;
        try {
            byte[] bArr2 = this.buffer;
            if (i11 > bArr2.length) {
                setLength(Math.max(i11, bArr2.length) * 2);
            }
            System.arraycopy(bArr, i9, this.buffer, i, i10);
            Iterator it = new ArrayList(this.fragments).iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                if (fragment.getOffset() <= i && i + i10 <= fragment.getOffset() + fragment.getLength()) {
                    return;
                }
                if (fragment.getOffset() <= i && i <= fragment.getOffset() + fragment.getLength()) {
                    int offset = (i + i10) - fragment.getOffset();
                    int offset2 = fragment.getOffset();
                    this.fragments.remove(fragment);
                    i10 = offset;
                    i = offset2;
                } else if (i <= fragment.getOffset() && fragment.getOffset() + fragment.getLength() <= i + i10) {
                    this.fragments.remove(fragment);
                } else if (i <= fragment.getOffset() && fragment.getOffset() <= i + i10) {
                    i10 = (fragment.getOffset() + fragment.getLength()) - i;
                    this.fragments.remove(fragment);
                }
            }
            this.fragments.add(Fragment.getInstance(i, i10));
        } catch (Throwable th) {
            throw th;
        }
    }
}
