import axios from 'axios'

const PERSONID = '1'
const PERSON_API_URL = 'http://localhost:8888'

class DataService {

    retrievePersons() {
        return axios.get(`${PERSON_API_URL}/persons`);
    }

    retrieveInterests(id) {
        return axios.get(`${PERSON_API_URL}/interests/${id}`);
    }
    retrieveLanguages(id) {
        return axios.get(`${PERSON_API_URL}/languages/${id}`);
    }

}

export default new DataService()