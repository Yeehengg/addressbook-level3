package seedu.addressbook.logic;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.Storage;

public class StorageStub extends Storage {

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {
        // Does nothing.
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // Does nothing.
        return null;
    }

    @Override
    public String getPath() {
        // Does wonderful things.
        return null;
    }

}