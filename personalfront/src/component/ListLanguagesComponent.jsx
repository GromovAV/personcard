import React, { Component } from 'react'
import DataService from '../service/DataService';

const PERSONID = '1'

class ListLanguagesComponent extends Component {
    constructor(props) {
        super(props)
        this.state = {
            languages: [],
            message: null
        }
        this.refreshLanguages = this.refreshLanguages.bind(this)
    }

    componentDidMount() {
        this.refreshLanguages();
    }

    refreshLanguages() {
        DataService.retrieveLanguages(PERSONID)
            .then(
                response => {
                    this.setState({languages: response.data })
                }
            )
    }

    render() {
        console.log('render')
        return (
            <div className="container">
                <h3>All Languages</h3>
                {this.state.message && <div class="alert alert-success">{this.state.message}</div>}
                <div className="container">
                    <table className="table">
                        <thead>
                            <tr>
                                {/*<th>Id</th>*/}
                                <th>Description</th>
                            </tr>
                        </thead>
                        <tbody>
                            {
                                this.state.languages.map(
                                    language =>
                                        <tr key={language.id}>
                                            {/*<td>{language.id}</td>*/}
                                            <td>{language.description}</td>
                                         </tr>
                                )
                            }
                        </tbody>
                    </table>
                </div>
            </div>
        )
    }
}

export default ListLanguagesComponent