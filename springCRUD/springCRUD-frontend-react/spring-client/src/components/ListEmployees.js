import React, { useState, useEffect } from 'react'
import EmployeesServic from '../services/EmployeesServic'

const ListEmployees = () => {

    const [employees, setEmployees] = useState([])

    useEffect(() => {
      EmployeesServic.getAllEmployees().then((Response)=>{

        setEmployees(Response.data)
        console.log(Response.data);
      }).catch(error =>{
        console.log(error);
      })
    }, [])
    

  return (
    
      <div className="container">
        <h2 className="text-center">List Employees</h2>
        <table className="table table-bordered table-striped">
            <thead>
                <tr>
                <th>Employee Id</th>
                <th>Employee First Name</th>
                <th>Employee Last Name</th>
                <th>Employee Email Id</th>
                </tr>
            </thead>
            <tbody>
                {
                employees.map(
                    employee =>
                    <tr key = {employee.id}>
                        <td>{employee.id}</td>
                        <td>{employee.firstName}</td>
                        <td>{employee.lastName}</td>
                        <td>{employee.emailid}</td>
                    </tr>
                )
            }
            </tbody>
        </table>
      </div>
    
  )
}

export default ListEmployees
