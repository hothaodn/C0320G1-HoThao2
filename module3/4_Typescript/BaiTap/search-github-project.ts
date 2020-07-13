interface ISingleRepo {
    name: string;
    html_url: string;
}
interface IRepos {
    items: Array<ISingleRepo>;
}

async function fetchRepo(search: string): Promise<Array<ISingleRepo>> {
    let res: Response | IRepos = await fetch(`https://api.github.com/search/repositories?q=${search}`);
    res = await res.json() as IRepos;
    return res.items;
}

function createItem(text: string): HTMLLIElement {
    const item = document.createElement('li') as HTMLLIElement;
    item.textContent = text;
    return item;
}
function createItemA(text: string) {
    const item = document.createElement('a');
    item.setAttribute('href', text);
    item.setAttribute('target', 'blank');
    item.textContent = text;
    return item;
}

const container = document.querySelector('.app .list');

async function main(input : HTMLInputElement) {
    const clear = document.getElementById('list');
    clear.innerHTML = "";
    // step 1: fetch repo
    const res = await fetchRepo(input.value);
    // step 2: lặp qua mảng các item trả về
    // step 3: call hàm createItem sau đó truyền vào name của từng item ở mỗi vòng lặp
    // step 4: call hàm container.appendChild(item mà hàm createItem trả về)
    res.forEach((item: any) => {
        const li = createItem(item.name);
        const a = createItemA(item.html_url);
        container.appendChild(li);
        container.appendChild(a);
    });
}
