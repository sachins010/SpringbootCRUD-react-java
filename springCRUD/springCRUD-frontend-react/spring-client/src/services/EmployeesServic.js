import axios from 'axios';

const EMPLOYEE_REST_API_URL = 'http://localhost:8090/api/employees';

class EmployeeService{

    getAllEmployees(){
        return axios.get(EMPLOYEE_REST_API_URL);
    }
}

export default new EmployeeService();