var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
function fetchRepo(search) {
    return __awaiter(this, void 0, void 0, function* () {
        let res = yield fetch(`https://api.github.com/search/repositories?q=${search}`);
        res = (yield res.json());
        return res.items;
    });
}
function createItem(text) {
    const item = document.createElement('li');
    item.textContent = text;
    return item;
}
function createItemA(text) {
    const item = document.createElement('a');
    item.setAttribute('href', text);
    item.setAttribute('target', 'blank');
    item.textContent = text;
    return item;
}
const container = document.querySelector('.app .list');
function main(input) {
    return __awaiter(this, void 0, void 0, function* () {
        const clear = document.getElementById('list');
        clear.innerHTML = "";
        // step 1: fetch repo
        const res = yield fetchRepo(input.value);
        // step 2: lặp qua mảng các item trả về
        // step 3: call hàm createItem sau đó truyền vào name của từng item ở mỗi vòng lặp
        // step 4: call hàm container.appendChild(item mà hàm createItem trả về)
        res.forEach((item) => {
            const li = createItem(item.name);
            const a = createItemA(item.html_url);
            container.appendChild(li);
            container.appendChild(a);
        });
    });
}
