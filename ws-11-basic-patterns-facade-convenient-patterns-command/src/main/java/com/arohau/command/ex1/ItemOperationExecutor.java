package com.arohau.command.ex1;

import java.util.ArrayList;
import java.util.List;

public class ItemOperationExecutor {

    // queue approach
    private List<ItemOperation> itemOperations = new ArrayList<>();

    public void queueOperation(ItemOperation itemOperation) {
        itemOperations.add(itemOperation);
    }

    public void checkout() {
        itemOperations.forEach(ItemOperation::execute);
        itemOperations.clear();
    }

    // common approach
    public void doOperation(ItemOperation itemOperation) {
        itemOperation.execute();
    }
}
