package com.google.android.gms.internal.firebase_messaging;

import com.bumptech.glide.load.Key;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* loaded from: classes.dex */
final class zzu implements ObjectEncoderContext {
    private static final Charset zza = Charset.forName(Key.STRING_CHARSET_NAME);
    private static final FieldDescriptor zzb;
    private static final FieldDescriptor zzc;
    private static final ObjectEncoder<Map.Entry<Object, Object>> zzd;
    private OutputStream zze;
    private final Map<Class<?>, ObjectEncoder<?>> zzf;
    private final Map<Class<?>, ValueEncoder<?>> zzg;
    private final ObjectEncoder<Object> zzh;
    private final zzy zzi = new zzy(this);

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("key");
        zzo zzoVar = new zzo();
        zzoVar.zza(1);
        zzb = builder.withProperty(zzoVar.zzb()).build();
        FieldDescriptor.Builder builder2 = FieldDescriptor.builder("value");
        zzo zzoVar2 = new zzo();
        zzoVar2.zza(2);
        zzc = builder2.withProperty(zzoVar2.zzb()).build();
        zzd = new ObjectEncoder() { // from class: com.google.android.gms.internal.firebase_messaging.zzt
            @Override // com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
                zzu.zzg((Map.Entry) obj, objectEncoderContext);
            }
        };
    }

    public zzu(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.zze = outputStream;
        this.zzf = map;
        this.zzg = map2;
        this.zzh = objectEncoder;
    }

    public static /* synthetic */ void zzg(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        objectEncoderContext.add(zzb, entry.getKey());
        objectEncoderContext.add(zzc, entry.getValue());
    }

    private static int zzh(FieldDescriptor fieldDescriptor) {
        zzs zzsVar = (zzs) fieldDescriptor.getProperty(zzs.class);
        if (zzsVar != null) {
            return zzsVar.zza();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final <T> long zzi(ObjectEncoder<T> objectEncoder, T t3) {
        zzp zzpVar = new zzp();
        try {
            OutputStream outputStream = this.zze;
            this.zze = zzpVar;
            try {
                objectEncoder.encode(t3, this);
                this.zze = outputStream;
                long zza2 = zzpVar.zza();
                zzpVar.close();
                return zza2;
            } catch (Throwable th) {
                this.zze = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                zzpVar.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    private static zzs zzj(FieldDescriptor fieldDescriptor) {
        zzs zzsVar = (zzs) fieldDescriptor.getProperty(zzs.class);
        if (zzsVar != null) {
            return zzsVar;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    private final <T> zzu zzk(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t3, boolean z10) {
        long zzi = zzi(objectEncoder, t3);
        if (z10 && zzi == 0) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 2);
        zzo(zzi);
        objectEncoder.encode(t3, this);
        return this;
    }

    private final <T> zzu zzl(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t3, boolean z10) {
        this.zzi.zza(fieldDescriptor, z10);
        valueEncoder.encode(t3, this.zzi);
        return this;
    }

    private static ByteBuffer zzm(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void zzn(int i) {
        while ((i & (-128)) != 0) {
            this.zze.write((i & 127) | 128);
            i >>>= 7;
        }
        this.zze.write(i & 127);
    }

    private final void zzo(long j10) {
        while (((-128) & j10) != 0) {
            this.zze.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.zze.write(((int) j10) & 127);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, double d10) {
        zza(fieldDescriptor, d10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext inline(Object obj) {
        zzf(obj);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(FieldDescriptor fieldDescriptor) {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    public final ObjectEncoderContext zza(FieldDescriptor fieldDescriptor, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 1);
        this.zze.write(zzm(8).putDouble(d10).array());
        return this;
    }

    public final ObjectEncoderContext zzb(FieldDescriptor fieldDescriptor, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        zzn((zzh(fieldDescriptor) << 3) | 5);
        this.zze.write(zzm(4).putFloat(f10).array());
        return this;
    }

    public final ObjectEncoderContext zzc(FieldDescriptor fieldDescriptor, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            zzn((zzh(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zze.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                zzc(fieldDescriptor, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzk(zzd, fieldDescriptor, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            zza(fieldDescriptor, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            zzb(fieldDescriptor, ((Float) obj).floatValue(), z10);
            return this;
        }
        if (obj instanceof Number) {
            zze(fieldDescriptor, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            zzd(fieldDescriptor, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            zzn((zzh(fieldDescriptor) << 3) | 2);
            zzn(bArr.length);
            this.zze.write(bArr);
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.zzf.get(obj.getClass());
        if (objectEncoder != null) {
            zzk(objectEncoder, fieldDescriptor, obj, z10);
            return this;
        }
        ValueEncoder<?> valueEncoder = this.zzg.get(obj.getClass());
        if (valueEncoder != null) {
            zzl(valueEncoder, fieldDescriptor, obj, z10);
            return this;
        }
        if (obj instanceof zzq) {
            zzd(fieldDescriptor, ((zzq) obj).getNumber(), true);
            return this;
        }
        if (obj instanceof Enum) {
            zzd(fieldDescriptor, ((Enum) obj).ordinal(), true);
            return this;
        }
        zzk(this.zzh, fieldDescriptor, obj, z10);
        return this;
    }

    public final zzu zzd(FieldDescriptor fieldDescriptor, int i, boolean z10) {
        if (z10 && i == 0) {
            return this;
        }
        zzs zzj = zzj(fieldDescriptor);
        zzr zzrVar = zzr.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzn(i);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzn((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 5);
            this.zze.write(zzm(4).putInt(i).array());
        }
        return this;
    }

    public final zzu zze(FieldDescriptor fieldDescriptor, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        zzs zzj = zzj(fieldDescriptor);
        zzr zzrVar = zzr.DEFAULT;
        int ordinal = zzj.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzj.zza() << 3);
            zzo(j10);
        } else if (ordinal == 1) {
            zzn(zzj.zza() << 3);
            zzo((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            zzn((zzj.zza() << 3) | 1);
            this.zze.write(zzm(8).putLong(j10).array());
        }
        return this;
    }

    public final zzu zzf(Object obj) {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.zzf.get(obj.getClass());
        if (objectEncoder == null) {
            throw new EncodingException("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        objectEncoder.encode(obj, this);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, float f10) {
        zzb(fieldDescriptor, f10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext nested(String str) {
        return nested(FieldDescriptor.of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, int i) {
        zzd(fieldDescriptor, i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, long j10) {
        zze(fieldDescriptor, j10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(FieldDescriptor fieldDescriptor, Object obj) {
        zzc(fieldDescriptor, obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final /* synthetic */ ObjectEncoderContext add(FieldDescriptor fieldDescriptor, boolean z10) {
        zzd(fieldDescriptor, z10 ? 1 : 0, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, double d10) {
        zza(FieldDescriptor.of(str), d10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, int i) {
        zzd(FieldDescriptor.of(str), i, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, long j10) {
        zze(FieldDescriptor.of(str), j10, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, Object obj) {
        zzc(FieldDescriptor.of(str), obj, true);
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    public final ObjectEncoderContext add(String str, boolean z10) {
        zzd(FieldDescriptor.of(str), z10 ? 1 : 0, true);
        return this;
    }
}
