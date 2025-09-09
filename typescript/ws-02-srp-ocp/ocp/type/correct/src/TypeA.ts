import { Type } from './Type';

export class TypeA implements Type {
    handle(): void {
        console.log('Here is the logic to handle TypeA');
    }
}