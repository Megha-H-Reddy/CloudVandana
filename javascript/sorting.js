function sortArrayDescending(arr) {
   
    arr.sort((a, b) => b - a);
    return arr;
}

const inputArray = [3, 1, 4, 1, 5, 9, 2, 16, 5, 3, 5];
const sortedDescending = sortArrayDescending(inputArray);
console.log(sortedDescending); 
