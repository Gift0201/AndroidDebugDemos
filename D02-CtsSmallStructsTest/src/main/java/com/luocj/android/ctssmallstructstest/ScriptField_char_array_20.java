/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: cts/tests/tests/renderscript/src/android/renderscript/cts/small_structs.rs
 */

package com.luocj.android.ctssmallstructstest;

import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.FieldPacker;
import android.renderscript.RSIllegalArgumentException;
import android.renderscript.RenderScript;
import android.renderscript.Script;
import android.renderscript.Type;

/**
 * @hide
 */
public class ScriptField_char_array_20 extends Script.FieldBase {
    static public class Item {

        byte[] bytes;

        Item() {
            bytes = new byte[20];
        }

    }

    private Item mItemArray[];
    private FieldPacker mIOBuffer;
    private static java.lang.ref.WeakReference<Element> mElementCache = new java.lang.ref.WeakReference<Element>(null);
    public static Element createElement(RenderScript rs) {
        Element.Builder eb = new Element.Builder(rs);
        eb.add(Element.I8(rs), "bytes", 20);
        return eb.create();
    }

    private  ScriptField_char_array_20(RenderScript rs) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
    }

    public  ScriptField_char_array_20(RenderScript rs, int count) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count);
    }

    public  ScriptField_char_array_20(RenderScript rs, int count, int usages) {
        mItemArray = null;
        mIOBuffer = null;
        mElement = createElement(rs);
        init(rs, count, usages);
    }

    public static ScriptField_char_array_20 create1D(RenderScript rs, int dimX, int usages) {
        ScriptField_char_array_20 obj = new ScriptField_char_array_20(rs);
        obj.mAllocation = Allocation.createSized(rs, obj.mElement, dimX, usages);
        return obj;
    }

    public static ScriptField_char_array_20 create1D(RenderScript rs, int dimX) {
        return create1D(rs, dimX, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_char_array_20 create2D(RenderScript rs, int dimX, int dimY) {
        return create2D(rs, dimX, dimY, Allocation.USAGE_SCRIPT);
    }

    public static ScriptField_char_array_20 create2D(RenderScript rs, int dimX, int dimY, int usages) {
        ScriptField_char_array_20 obj = new ScriptField_char_array_20(rs);
        Type.Builder b = new Type.Builder(rs, obj.mElement);
        b.setX(dimX);
        b.setY(dimY);
        Type t = b.create();
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    public static Type.Builder createTypeBuilder(RenderScript rs) {
        Element e = createElement(rs);
        return new Type.Builder(rs, e);
    }

    public static ScriptField_char_array_20 createCustom(RenderScript rs, Type.Builder tb, int usages) {
        ScriptField_char_array_20 obj = new ScriptField_char_array_20(rs);
        Type t = tb.create();
        if (t.getElement() != obj.mElement) {
            throw new RSIllegalArgumentException("Type.Builder did not match expected element type.");
        }
        obj.mAllocation = Allocation.createTyped(rs, t, usages);
        return obj;
    }

    private void copyToArrayLocal(Item i, FieldPacker fp) {
        for (int ct2 = 0; ct2 < 20; ct2++) {
            fp.addI8(i.bytes[ct2]);
        }

    }

    private void copyToArray(Item i, int index) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        mIOBuffer.reset(index * mElement.getBytesSize());
        copyToArrayLocal(i, mIOBuffer);
    }

    public synchronized void set(Item i, int index, boolean copyNow) {
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        mItemArray[index] = i;
        if (copyNow)  {
            copyToArray(i, index);
            FieldPacker fp = new FieldPacker(mElement.getBytesSize());
            copyToArrayLocal(i, fp);
            mAllocation.setFromFieldPacker(index, fp);
        }

    }

    public synchronized Item get(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index];
    }

    public synchronized void set_bytes(int index, byte[] v, boolean copyNow) {
        if (mIOBuffer == null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
        if (mItemArray == null) mItemArray = new Item[getType().getX() /* count */];
        if (mItemArray[index] == null) mItemArray[index] = new Item();
        mItemArray[index].bytes = v;
        if (copyNow)  {
            mIOBuffer.reset(index * mElement.getBytesSize());
            for (int ct1 = 0; ct1 < 20; ct1++) {
                mIOBuffer.addI8(v[ct1]);
            }

            FieldPacker fp = new FieldPacker(20);
            for (int ct1 = 0; ct1 < 20; ct1++) {
                fp.addI8(v[ct1]);
            }

            mAllocation.setFromFieldPacker(index, 0, fp);
        }

    }

    public synchronized byte[] get_bytes(int index) {
        if (mItemArray == null) return null;
        return mItemArray[index].bytes;
    }

    public synchronized void copyAll() {
        for (int ct = 0; ct < mItemArray.length; ct++) copyToArray(mItemArray[ct], ct);
        mAllocation.setFromFieldPacker(0, mIOBuffer);
    }

    public synchronized void resize(int newSize) {
        if (mItemArray != null)  {
            int oldSize = mItemArray.length;
            int copySize = Math.min(oldSize, newSize);
            if (newSize == oldSize) return;
            Item ni[] = new Item[newSize];
            System.arraycopy(mItemArray, 0, ni, 0, copySize);
            mItemArray = ni;
        }

        mAllocation.resize(newSize);
        if (mIOBuffer != null) mIOBuffer = new FieldPacker(mElement.getBytesSize() * getType().getX()/* count */);
    }

}

