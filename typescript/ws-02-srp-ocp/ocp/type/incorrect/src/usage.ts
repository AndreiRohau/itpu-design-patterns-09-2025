console.log("works")

// Main.ts
import { Type } from './Type';
import { TypeA } from './TypeA';
import { TypeB } from './TypeB';
import { TypeC } from './TypeC';

function main() {
    // input
    const list: Type[] = [new TypeA(), new TypeB(), new TypeC()];

    // processing
    handleTypes(list);
}

// Every new type functionality implementation requires code changes
// in the place where current functionality is located
function handleTypes(list: Type[]) {
    list.forEach((e) => {
        const type = e.constructor.name;
        switch (type) {
            case 'TypeA':
                executeTypeAFunc();
                break;
            case 'TypeB':
                executeTypeBFunc();
                break;
            case 'TypeC':
                executeTypeCFunc();
                break;
            default:
                executeUnknownFunc(type);
        }
    });
}

function executeTypeAFunc() {
    console.log('Here is the logic to handle TypeA');
}

function executeTypeBFunc() {
    console.log('Here is the different logic to handle TypeB');
}

function executeTypeCFunc() {
    console.log('Here is the different logic to handle TypeC');
}

function executeUnknownFunc(type: string) {
    console.log('Unknown type:', type);
}

// Entry point
main();