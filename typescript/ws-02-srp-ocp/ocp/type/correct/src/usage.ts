console.log("works")  
import { Type } from './Type';
import { TypeA } from './TypeA';
import { TypeB } from './TypeB';
import { TypeC } from './TypeC';

function main(): void {
    // input
    const list: Type[] = [
        new TypeA(),
        new TypeB(),
        new TypeC(),
    ];

    // processing
    handleTypes(list);
}

// Now processing does not care about whether we have new types functionality
function handleTypes(list: Type[]): void {
    list.forEach((type) => type.handle());
}

// Entry point
main();
