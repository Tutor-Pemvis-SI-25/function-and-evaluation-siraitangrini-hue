//Angrini necy sirait - 12S25009
function main() {
    var totaldata;
    var command;
    var deskripsi = createArray(10), kode = createArray(10), matkul = createArray(10), dosen = createArray(10), deadline = createArray(10), ketID = createArray(10);
    var kesulitan = createArray(10), hari = createArray(10);
    var status = createArray(10);
    var prioritas = createArray(10);

    totaldata = 0;
    while (command != "---") {
        command = window.prompt('Enter a value for command');
        if (command == "add task") {
            addtask();
        }
        if (command == "update task status") {
            addtask();
            if (command == "sho assigment") {
                showassignment();
                if (command == "---") {
                }
            }
        }
    }
    if (totaldata < 10) {
        deskripsi[totaldata] = window.prompt('Enter a value for deskripsi[totaldata]');
    }
    if (deskripsi[totaldata] == "---") {
    }
    kode[totaldata] = window.prompt('Enter a value for kode[totaldata]');
    matkul[totaldata] = window.prompt('Enter a value for matkul[totaldata]');
    dosen[totaldata] = window.prompt('Enter a value for dosen[totaldata]');
    deadline[totaldata] = window.prompt('Enter a value for deadline[totaldata]');
    ketID[totaldata] = window.prompt('Enter a value for ketID[totaldata]');
    kesulitan[totaldata] = Number(window.prompt('Enter a value for kesulitan[totaldata]'));
    hari[totaldata] = Number(window.prompt('Enter a value for hari[totaldata]'));
    status[totaldata] = window.prompt('Enter a value for status[totaldata]');
}

