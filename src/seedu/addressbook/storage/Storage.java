package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.exception.IllegalValueException;


public abstract class Storage {

    /**
     * Signals that the given file path does not fulfill the storage path constraints.
     */
    public static class InvalidStoragePathException extends IllegalValueException {
        public InvalidStoragePathException(String message) {
            super(message);
        }
    }

    /**
     * Signals that some error has occured while trying to convert and read/write data between the application
     * and the storage file.
     */
    public static class StorageOperationException extends Exception {
        public StorageOperationException(String message) {
            super(message);
        }
    }
    
    public static Storage createDefault() throws InvalidStoragePathException {
        return new StorageFile();		       
    }		      
    
    /**
     * Saves all data to this storage.
     *
     * @throws StorageOperationException if there were errors converting and/or storing data to this storage.
     */
    public abstract void save(AddressBook addressBook) throws StorageOperationException;
    
    /**
     * Loads data from this storage.
     *
     * @throws StorageOperationException if there were errors reading and/or converting data this storage.
     */
    public abstract AddressBook load() throws StorageOperationException;
    
    

    public abstract String getPath();
}