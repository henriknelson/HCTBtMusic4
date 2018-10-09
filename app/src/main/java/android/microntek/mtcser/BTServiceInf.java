package android.microntek.mtcser;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface BTServiceInf extends IInterface {

    public static abstract class Stub extends Binder implements BTServiceInf {
        private static final String DESCRIPTOR = "android.microntek.mtcser.BTServiceInf";
        static final int TRANSACTION_IsConferenceCalling = 8;
        static final int TRANSACTION_IsThreeWayCalling = 7;
        static final int TRANSACTION_addCall = 21;
        static final int TRANSACTION_answerCall = 18;
        static final int TRANSACTION_avPlayNext = 17;
        static final int TRANSACTION_avPlayPause = 14;
        static final int TRANSACTION_avPlayPrev = 16;
        static final int TRANSACTION_avPlayStop = 15;
        static final int TRANSACTION_connectBT = 35;
        static final int TRANSACTION_connectOBD = 37;
        static final int TRANSACTION_deleteBT = 40;
        static final int TRANSACTION_deleteHistory = 47;
        static final int TRANSACTION_deleteHistoryAll = 48;
        static final int TRANSACTION_deleteOBD = 39;
        static final int TRANSACTION_dialOut = 53;
        static final int TRANSACTION_dialOutSub = 54;
        static final int TRANSACTION_disconnectBT = 36;
        static final int TRANSACTION_disconnectOBD = 38;
        static final int TRANSACTION_getAVState = 3;
        static final int TRANSACTION_getAutoAnswer = 34;
        static final int TRANSACTION_getAutoConnect = 32;
        static final int TRANSACTION_getBTState = 2;
        static final int TRANSACTION_getCallInNum = 5;
        static final int TRANSACTION_getCallingNumberList = 10;
        static final int TRANSACTION_getDeviceList = 43;
        static final int TRANSACTION_getDialOutNum = 4;
        static final int TRANSACTION_getHistoryList = 44;
        static final int TRANSACTION_getMatchList = 42;
        static final int TRANSACTION_getModuleName = 27;
        static final int TRANSACTION_getModulePassword = 28;
        static final int TRANSACTION_getMusicInfo = 56;
        static final int TRANSACTION_getNowDevAddr = 11;
        static final int TRANSACTION_getNowDevName = 12;
        static final int TRANSACTION_getNowDevUuids = 13;
        static final int TRANSACTION_getOBDstate = 57;
        static final int TRANSACTION_getPhoneBookList = 45;
        static final int TRANSACTION_getPhoneNum = 6;
        static final int TRANSACTION_getThreeWayCallNum = 9;
        static final int TRANSACTION_hangupCall = 19;
        static final int TRANSACTION_init = 1;
        static final int TRANSACTION_mergeCall = 23;
        static final int TRANSACTION_musicMute = 49;
        static final int TRANSACTION_musicUnmute = 50;
        static final int TRANSACTION_reDial = 55;
        static final int TRANSACTION_rejectCall = 20;
        static final int TRANSACTION_requestBtInfo = 58;
        static final int TRANSACTION_scanStart = 51;
        static final int TRANSACTION_scanStop = 52;
        static final int TRANSACTION_setAutoAnswer = 33;
        static final int TRANSACTION_setAutoConnect = 31;
        static final int TRANSACTION_setModuleName = 29;
        static final int TRANSACTION_setModulePassword = 30;
        static final int TRANSACTION_setPhoneBookList = 46;
        static final int TRANSACTION_swichCall = 22;
        static final int TRANSACTION_switchVoice = 25;
        static final int TRANSACTION_syncMatchList = 41;
        static final int TRANSACTION_syncPhonebook = 26;
        static final int TRANSACTION_voiceControl = 24;


        private static class Proxy implements BTServiceInf {
            private IBinder mRemote;

            Proxy(IBinder remote) {
                this.mRemote = remote;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void init() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_init, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public byte getBTState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getBTState, obtain, obtain2, 0);
                    obtain2.readException();
                    byte readByte = obtain2.readByte();
                    return readByte;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public byte getAVState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getAVState, obtain, obtain2, 0);
                    obtain2.readException();
                    byte readByte = obtain2.readByte();
                    return readByte;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getDialOutNum() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getDialOutNum, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getCallInNum() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getCallInNum, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getPhoneNum() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getPhoneNum, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean IsThreeWayCalling() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_IsThreeWayCalling, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
                return z;
            }

            public boolean IsConferenceCalling() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_IsConferenceCalling, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
                return z;
            }

            public String getThreeWayCallNum() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getThreeWayCallNum, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> getCallingNumberList() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getCallingNumberList, obtain, obtain2, 0);
                    obtain2.readException();
                    List<String> createStringArrayList = obtain2.createStringArrayList();
                    return createStringArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long getNowDevAddr() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getNowDevAddr, obtain, obtain2, 0);
                    obtain2.readException();
                    long readLong = obtain2.readLong();
                    return readLong;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getNowDevName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getNowDevName, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> getNowDevUuids() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getNowDevUuids, obtain, obtain2, 0);
                    obtain2.readException();
                    List<String> createStringArrayList = obtain2.createStringArrayList();
                    return createStringArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void avPlayPause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_avPlayPause, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void avPlayStop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_avPlayStop, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void avPlayPrev() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_avPlayPrev, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void avPlayNext() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_avPlayNext, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void answerCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_answerCall, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void hangupCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_hangupCall, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void rejectCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_rejectCall, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void addCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_addCall, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void swichCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_swichCall, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void mergeCall() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_mergeCall, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void voiceControl() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_voiceControl, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void switchVoice() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_switchVoice, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void syncPhonebook() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_syncPhonebook, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getModuleName() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getModuleName, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getModulePassword() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getModulePassword, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setModuleName(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_setModuleName, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setModulePassword(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_setModulePassword, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setAutoConnect(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_setAutoConnect, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean getAutoConnect() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getAutoConnect, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
                return z;
            }

            public void setAutoAnswer(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_setAutoAnswer, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean getAutoAnswer() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getAutoAnswer, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z;
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                }
                return z;
            }

            public void connectBT(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_connectBT, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void disconnectBT(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_disconnectBT, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void connectOBD(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_connectOBD, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void disconnectOBD(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_disconnectOBD, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void deleteOBD(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_deleteOBD, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void deleteBT(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_deleteBT, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void syncMatchList() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_syncMatchList, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> getMatchList() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getMatchList, obtain, obtain2, 0);
                    obtain2.readException();
                    List<String> createStringArrayList = obtain2.createStringArrayList();
                    return createStringArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> getDeviceList() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getDeviceList, obtain, obtain2, 0);
                    obtain2.readException();
                    List<String> createStringArrayList = obtain2.createStringArrayList();
                    return createStringArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> getHistoryList() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getHistoryList, obtain, obtain2, 0);
                    obtain2.readException();
                    List<String> createStringArrayList = obtain2.createStringArrayList();
                    return createStringArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public List<String> getPhoneBookList() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getPhoneBookList, obtain, obtain2, 0);
                    obtain2.readException();
                    List<String> createStringArrayList = obtain2.createStringArrayList();
                    return createStringArrayList;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void setPhoneBookList(List<String> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStringList(list);
                    this.mRemote.transact(Stub.TRANSACTION_setPhoneBookList, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void deleteHistory(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    this.mRemote.transact(Stub.TRANSACTION_deleteHistory, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void deleteHistoryAll() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_deleteHistoryAll, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicMute() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_musicMute, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void musicUnmute() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_musicUnmute, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void scanStart() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_scanStart, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void scanStop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_scanStop, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void dialOut(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeString(str);
                    this.mRemote.transact(Stub.TRANSACTION_dialOut, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void dialOutSub(char c) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(c);
                    this.mRemote.transact(Stub.TRANSACTION_dialOutSub, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void reDial() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_reDial, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getMusicInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getMusicInfo, obtain, obtain2, 0);
                    obtain2.readException();
                    String readString = obtain2.readString();
                    return readString;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public int getOBDstate() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_getOBDstate, obtain, obtain2, 0);
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void requestBtInfo() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(Stub.TRANSACTION_requestBtInfo, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

        }

        public static BTServiceInf asInterface(IBinder obj) {
            if (obj == null) {
                return null;
            }
            IInterface iin = obj.queryLocalInterface("android.microntek.mtcser.BTServiceInf");
            if (iin == null || !(iin instanceof BTServiceInf)) {
                return new Proxy(obj);
            }
            return (BTServiceInf) iin;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            int i3 = 0;
            byte bTState;
            String dialOutNum;
            boolean IsThreeWayCalling;
            List callingNumberList;
            boolean z;
            switch (i) {
                case Stub.TRANSACTION_init:
                    parcel.enforceInterface(DESCRIPTOR);
                    init();
                    parcel2.writeNoException();
                    return true;
                case Stub.TRANSACTION_getBTState:
                    parcel.enforceInterface(DESCRIPTOR);
                    bTState = getBTState();
                    parcel2.writeNoException();
                    parcel2.writeByte(bTState);
                    return true;
                case TRANSACTION_getAVState:
                    parcel.enforceInterface(DESCRIPTOR);
                    bTState = getAVState();
                    parcel2.writeNoException();
                    parcel2.writeByte(bTState);
                    return true;
                case TRANSACTION_getDialOutNum:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getDialOutNum();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_getCallInNum:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getCallInNum();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_getPhoneNum:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getPhoneNum();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_IsThreeWayCalling /*7*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    IsThreeWayCalling = IsThreeWayCalling();
                    parcel2.writeNoException();
                    if (IsThreeWayCalling) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case TRANSACTION_IsConferenceCalling /*8*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    IsThreeWayCalling = IsConferenceCalling();
                    parcel2.writeNoException();
                    if (IsThreeWayCalling) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case TRANSACTION_getThreeWayCallNum /*9*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getThreeWayCallNum();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_getCallingNumberList /*10*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    callingNumberList = getCallingNumberList();
                    parcel2.writeNoException();
                    parcel2.writeStringList(callingNumberList);
                    return true;
                case TRANSACTION_getNowDevAddr /*11*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    long nowDevAddr = getNowDevAddr();
                    parcel2.writeNoException();
                    parcel2.writeLong(nowDevAddr);
                    return true;
                case TRANSACTION_getNowDevName /*12*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getNowDevName();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_getNowDevUuids /*13*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    callingNumberList = getNowDevUuids();
                    parcel2.writeNoException();
                    parcel2.writeStringList(callingNumberList);
                    return true;
                case TRANSACTION_avPlayPause /*14*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    avPlayPause();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_avPlayStop /*15*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    avPlayStop();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_avPlayPrev /*16*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    avPlayPrev();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_avPlayNext /*17*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    avPlayNext();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_answerCall /*18*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    answerCall();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_hangupCall /*19*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    hangupCall();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_rejectCall /*20*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    rejectCall();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_addCall /*21*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    addCall();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_swichCall /*22*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    swichCall();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_mergeCall /*23*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    mergeCall();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_voiceControl /*24*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    voiceControl();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_switchVoice /*25*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    switchVoice();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_syncPhonebook /*26*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    syncPhonebook();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getModuleName /*27*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getModuleName();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_getModulePassword /*28*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getModulePassword();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_setModuleName /*29*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    setModuleName(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_setModulePassword /*30*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    setModulePassword(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_setAutoConnect /*31*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    z = false;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setAutoConnect(z);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getAutoConnect /*32*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    IsThreeWayCalling = getAutoConnect();
                    parcel2.writeNoException();
                    if (IsThreeWayCalling) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case TRANSACTION_setAutoAnswer /*33*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    z = false;
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    setAutoAnswer(z);
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getAutoAnswer /*34*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    IsThreeWayCalling = getAutoAnswer();
                    parcel2.writeNoException();
                    if (IsThreeWayCalling) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case TRANSACTION_connectBT /*35*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    connectBT(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_disconnectBT /*36*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    disconnectBT(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_connectOBD /*37*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    connectOBD(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_disconnectOBD /*38*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    disconnectOBD(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_deleteOBD /*39*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    deleteOBD(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_deleteBT /*40*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    deleteBT(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_syncMatchList /*41*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    syncMatchList();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getMatchList /*42*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    callingNumberList = getMatchList();
                    parcel2.writeNoException();
                    parcel2.writeStringList(callingNumberList);
                    return true;
                case TRANSACTION_getDeviceList /*43*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    callingNumberList = getDeviceList();
                    parcel2.writeNoException();
                    parcel2.writeStringList(callingNumberList);
                    return true;
                case TRANSACTION_getHistoryList /*44*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    callingNumberList = getHistoryList();
                    parcel2.writeNoException();
                    parcel2.writeStringList(callingNumberList);
                    return true;
                case TRANSACTION_getPhoneBookList /*45*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    callingNumberList = getPhoneBookList();
                    parcel2.writeNoException();
                    parcel2.writeStringList(callingNumberList);
                    return true;
                case TRANSACTION_setPhoneBookList /*46*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPhoneBookList(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_deleteHistory /*47*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    deleteHistory(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_deleteHistoryAll /*48*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    deleteHistoryAll();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_musicMute /*49*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    musicMute();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_musicUnmute /*50*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    musicUnmute();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_scanStart /*51*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    scanStart();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_scanStop /*52*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    scanStop();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_dialOut /*53*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOut(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_dialOutSub /*54*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutSub((char) parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_reDial /*55*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    reDial();
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_getMusicInfo /*56*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    dialOutNum = getMusicInfo();
                    parcel2.writeNoException();
                    parcel2.writeString(dialOutNum);
                    return true;
                case TRANSACTION_getOBDstate /*57*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    i3 = getOBDstate();
                    parcel2.writeNoException();
                    parcel2.writeInt(i3);
                    return true;
                case TRANSACTION_requestBtInfo /*58*/:
                    parcel.enforceInterface(DESCRIPTOR);
                    requestBtInfo();
                    parcel2.writeNoException();
                    return true;
                case 1598968902:
                    parcel2.writeString(DESCRIPTOR);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    boolean IsConferenceCalling() throws RemoteException;

    boolean IsThreeWayCalling() throws RemoteException;

    void addCall() throws RemoteException;

    void answerCall() throws RemoteException;

    void avPlayNext() throws RemoteException;

    void avPlayPause() throws RemoteException;

    void avPlayPrev() throws RemoteException;

    void avPlayStop() throws RemoteException;

    void connectBT(String str) throws RemoteException;

    void connectOBD(String str) throws RemoteException;

    void deleteBT(String str) throws RemoteException;

    void deleteHistory(int i) throws RemoteException;

    void deleteHistoryAll() throws RemoteException;

    void deleteOBD(String str) throws RemoteException;

    void dialOut(String str) throws RemoteException;

    void dialOutSub(char c) throws RemoteException;

    void disconnectBT(String str) throws RemoteException;

    void disconnectOBD(String str) throws RemoteException;

    byte getAVState() throws RemoteException;

    boolean getAutoAnswer() throws RemoteException;

    boolean getAutoConnect() throws RemoteException;

    byte getBTState() throws RemoteException;

    String getCallInNum() throws RemoteException;

    List<String> getCallingNumberList() throws RemoteException;

    List<String> getDeviceList() throws RemoteException;

    String getDialOutNum() throws RemoteException;

    List<String> getHistoryList() throws RemoteException;

    List<String> getMatchList() throws RemoteException;

    String getModuleName() throws RemoteException;

    String getModulePassword() throws RemoteException;

    String getMusicInfo() throws RemoteException;

    long getNowDevAddr() throws RemoteException;

    String getNowDevName() throws RemoteException;

    List<String> getNowDevUuids() throws RemoteException;

    int getOBDstate() throws RemoteException;

    List<String> getPhoneBookList() throws RemoteException;

    String getPhoneNum() throws RemoteException;

    String getThreeWayCallNum() throws RemoteException;

    void hangupCall() throws RemoteException;

    void init() throws RemoteException;

    void mergeCall() throws RemoteException;

    void musicMute() throws RemoteException;

    void musicUnmute() throws RemoteException;

    void reDial() throws RemoteException;

    void rejectCall() throws RemoteException;

    void requestBtInfo() throws RemoteException;

    void scanStart() throws RemoteException;

    void scanStop() throws RemoteException;

    void setAutoAnswer(boolean z) throws RemoteException;

    void setAutoConnect(boolean z) throws RemoteException;

    void setModuleName(String str) throws RemoteException;

    void setModulePassword(String str) throws RemoteException;

    void setPhoneBookList(List<String> list) throws RemoteException;

    void swichCall() throws RemoteException;

    void switchVoice() throws RemoteException;

    void syncMatchList() throws RemoteException;

    void syncPhonebook() throws RemoteException;

    void voiceControl() throws RemoteException;

}