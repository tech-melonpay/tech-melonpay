package kotlin.collections.builders;

import P9.i;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;

/* compiled from: ListBuilder.kt */
/* loaded from: classes2.dex */
public final class SerializedCollection implements Externalizable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public Collection<?> f23144a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23145b;

    public SerializedCollection() {
        this(0, EmptyList.f23104a);
    }

    private final Object readResolve() {
        return this.f23144a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Collection<?> a10;
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + '.');
        }
        int readInt = objectInput.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        int i9 = 0;
        if (i == 0) {
            ListBuilder listBuilder = new ListBuilder(readInt);
            while (i9 < readInt) {
                listBuilder.add(objectInput.readObject());
                i9++;
            }
            a10 = i.a(listBuilder);
        } else {
            if (i != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i + '.');
            }
            SetBuilder setBuilder = new SetBuilder(new MapBuilder(readInt));
            while (i9 < readInt) {
                setBuilder.add(objectInput.readObject());
                i9++;
            }
            a10 = i.b(setBuilder);
        }
        this.f23144a = a10;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeByte(this.f23145b);
        objectOutput.writeInt(this.f23144a.size());
        Iterator<?> it = this.f23144a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    public SerializedCollection(int i, Collection collection) {
        this.f23144a = collection;
        this.f23145b = i;
    }
}
