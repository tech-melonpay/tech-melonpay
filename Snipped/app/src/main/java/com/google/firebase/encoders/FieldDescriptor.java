package com.google.firebase.encoders;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FieldDescriptor {
    private final String name;
    private final Map<Class<?>, Object> properties;

    public static final class Builder {
        private final String name;
        private Map<Class<?>, Object> properties = null;

        public Builder(String str) {
            this.name = str;
        }

        public FieldDescriptor build() {
            return new FieldDescriptor(this.name, this.properties == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.properties)));
        }

        public <T extends Annotation> Builder withProperty(T t3) {
            if (this.properties == null) {
                this.properties = new HashMap();
            }
            this.properties.put(t3.annotationType(), t3);
            return this;
        }
    }

    public static Builder builder(String str) {
        return new Builder(str);
    }

    public static FieldDescriptor of(String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.name.equals(fieldDescriptor.name) && this.properties.equals(fieldDescriptor.properties);
    }

    public String getName() {
        return this.name;
    }

    public <T extends Annotation> T getProperty(Class<T> cls) {
        return (T) this.properties.get(cls);
    }

    public int hashCode() {
        return this.properties.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.name + ", properties=" + this.properties.values() + "}";
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.name = str;
        this.properties = map;
    }
}
